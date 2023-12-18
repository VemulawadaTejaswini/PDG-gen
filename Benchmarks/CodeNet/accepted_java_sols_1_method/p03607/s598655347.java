import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt();
        Map<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<N;i++){
            int A=sc.nextInt();
            if(!count.containsKey(A)){
                count.put(A,1);
            }
            else{
                count.remove(A);
            }
        }
        System.out.println(count.size());
    }
}