import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int ans=0;
        PriorityQueue<Integer[]> ab=new PriorityQueue<>((p1,p2)->Integer.compare(p1[0], p2[0]));
        PriorityQueue<Integer> b=new PriorityQueue<>();

        for(int i=0;i<N;i++){
            Integer AB[]=new Integer[2];
            AB[0]=sc.nextInt();
            AB[1]=sc.nextInt();
            ab.offer(AB);
        }

        for(int day=1;day<=M;day++){
            Integer cab[];
            while(true){
                if(ab.size()>0){
                    cab=ab.poll();
                }else{
                    break;
                }
                
                if(cab[0]<=day){
                    b.offer(-cab[1]);
                }else{
                    ab.offer(cab);
                    break;
                }
            }
            if(b.size()>0){
                ans-=b.poll();
            }
        }
        System.out.println(ans);
        sc.close();
    }
}