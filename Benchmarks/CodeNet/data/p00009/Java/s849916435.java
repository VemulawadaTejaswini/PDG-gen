import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        for(int k = 3; k < 999999; k++){
            boolean f = true;
            for(int i: list){
                if(i > Math.sqrt(k)) break;
                if(k % i == 0){
                    f = false;
                    break;
                }
            }
            if(f) list.add(k);
        }
        while(in.hasNextLine()){
            int i = in.nextInt();
            System.out.println(list.stream().filter(l -> l <= i).count());
        }
    }
}