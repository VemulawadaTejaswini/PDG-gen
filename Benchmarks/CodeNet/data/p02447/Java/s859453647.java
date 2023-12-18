import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Pair> pairs = new ArrayList<>();
        for(int i = 0;i < n;i++){
            pairs.add(new Pair(sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(pairs);
        Iterator<Pair> it = pairs.iterator();
        while(it.hasNext()){
            Pair a = it.next();
            a.print();
        }
    }

    static class Pair implements Comparable<Pair>{
        int x,y;
        Pair(int x,int y){
            this.x = x;
            this.y = y;
        }

        public int compareTo(Pair p){
            if(x < p.x) return -1;
            else if(x == p.x){
                if(y < p.y) return -1;
                else return 1;
            }
            else    return 1;
        }

        public void print(){
            System.out.println(x+" "+y);
        }
        
    }
}
