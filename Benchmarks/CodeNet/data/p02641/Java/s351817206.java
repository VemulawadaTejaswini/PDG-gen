import java.util.*;
class Main {
    public static void main(String []args) {
        Scanner scn= new Scanner(System.in);
        int x= scn.nextInt();
        int n=scn.nextInt();
        int []arr= new int[n];
        HashSet<Integer> map= new HashSet<>();
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            map.add(arr[i]);
        }
        int diff=0;
        while(true){
            int no=x-diff;
            if(!map.contains(no)){
                System.out.println(no);
                return;
            }
            no=x+diff;
            if(!map.contains(no)){
                System.out.println(no);
                return;
            }
            diff++;
        }
    }
}