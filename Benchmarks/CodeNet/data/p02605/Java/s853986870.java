import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, List<List<PL>>> xpy = new HashMap<>(); // 0 <= X+Y <= 400000  Matters 1-4 (1.Y-4.X) , 2-3  (2.X-3.Y)
        Map<Integer, List<List<PL>>> xmy = new HashMap<>(); // -200000 <= X-Y <= 200000  Matters 1-2(2.Y-1.X) , 3-4 (3.X-4.Y)
        Map<Integer, List<List<PL>>> xmp = new HashMap<>(); // 0 <= X <= 200000 Matters 1-3 (3.Y-1.Y)
        Map<Integer, List<List<PL>>> ymp = new HashMap<>(); // 0 <= Y <= 200000 Matters 2-4 (2.X-4.X)
        for(int i=0;i<N;i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            String D = sc.nextLine();
            PL plane = new PL(X,Y,D);
            //System.out.println(plane);
            xpy.putIfAbsent(X+Y, newPLLists());
            xpy.get(X+Y).get(plane.D-1).add(plane);

            xmy.putIfAbsent(X-Y, newPLLists());
            xmy.get(X-Y).get(plane.D-1).add(plane);

            xmp.putIfAbsent(X, newPLLists());
            xmp.get(X).get(plane.D-1).add(plane);

            ymp.putIfAbsent(Y, newPLLists());
            ymp.get(Y).get(plane.D-1).add(plane);
        }
        long min_time = 500000000;
        for(List<List<PL>> lists: xpy.values()){
            min_time = Math.min(
                    min_time,
                    getMinTime(lists.get(0).stream().map(pl->pl.Y).sorted().collect(Collectors.toList()), lists.get(3).stream().map(pl->pl.X).sorted().collect(Collectors.toList()))
            );
            min_time = Math.min(
                    min_time,
                    getMinTime(lists.get(1).stream().map(pl->pl.X).sorted().collect(Collectors.toList()), lists.get(2).stream().map(pl->pl.Y).sorted().collect(Collectors.toList()))
            );
        }

        for(List<List<PL>> lists: xmy.values()){
            min_time = Math.min(
                    min_time,
                    getMinTime(lists.get(1).stream().map(pl->pl.Y).sorted().collect(Collectors.toList()), lists.get(0).stream().map(pl->pl.X).sorted().collect(Collectors.toList()))
            );
            min_time = Math.min(
                    min_time,
                    getMinTime(lists.get(2).stream().map(pl->pl.X).sorted().collect(Collectors.toList()), lists.get(3).stream().map(pl->pl.Y).sorted().collect(Collectors.toList()))
            );
        }
        for(List<List<PL>> lists: xmp.values()){
            min_time = Math.min(
                    min_time,
                    getMinTime(lists.get(2).stream().map(pl->pl.Y).sorted().collect(Collectors.toList()), lists.get(0).stream().map(pl->pl.Y).sorted().collect(Collectors.toList()))
            );
        }
        for(List<List<PL>> lists: ymp.values()){
            min_time = Math.min(
                    min_time,
                    getMinTime(lists.get(1).stream().map(pl->pl.X).sorted().collect(Collectors.toList()), lists.get(3).stream().map(pl->pl.X).sorted().collect(Collectors.toList()))
            );
        }


        if(min_time == 500000000){
            System.out.println("SAFE");
        }else{
            System.out.println(min_time*5);
        }
    }

    private static long getMinTime(List<Integer> larger, List<Integer> smaller) {
        if(larger.size() == 0 || smaller.size() == 0){
            return 500000000;
        }
        if(larger.get(larger.size()-1) < smaller.get(0)){
            return 500000000;
        }
        if(larger.get(0) > smaller.get(smaller.size()-1)){
            return larger.get(0) - smaller.get(smaller.size()-1);
        }
        long minTime = 500000000;
        for(Integer l:larger){
            for(Integer s:smaller){
                if(l>s){
                    minTime = Math.min(l-s, minTime);
                }
            }
        }
        return minTime;
    }

    private static List<List<PL>> newPLLists(){
        List<List<PL>> ret = new ArrayList<>();
        for(int i=0;i<4;i++){
            ret.add(new ArrayList<>());
        }
        return ret;
    }

    private static class PL{
        public int X,Y;
        public int D;
        PL(int X, int Y, String Dir){
            if(Dir.contains("U")){
                D = 1;
            }else if(Dir.contains("L")){
                D = 2;
            }else if(Dir.contains("D")) {
                D = 3;
            }else {
                D = 4;
            }
            this.X = X;
            this.Y = Y;
        }
        @Override
        public String toString(){
            return X + "-" + Y + " Dir: " + D;
        }
    }

}
