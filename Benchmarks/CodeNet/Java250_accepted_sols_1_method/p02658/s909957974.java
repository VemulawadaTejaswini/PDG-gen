import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                ArrayList<Long> a = new ArrayList<>(); 
                for(int i=0; i<N;i++){
                    long A1 = scan.nextLong();
                    if(A1==0){
                        System.out.println(0);
                        System.exit(0);
                    }
                    a.add(A1);
                }
                long ans = 1;
                for(int i=0; i<N;i++){
                    long q = (long)Math.pow(10,18)/(long)a.get(i);
                    if(ans<=q){
                    ans = ans * a.get(i);
                    }else{
                         System.out.println(-1);
                        System.exit(0);
                    }
                } 
                if((long)Math.pow(10,18)<ans){
                        System.out.println(-1);
                        System.exit(0);
                    }
                System.out.println(ans);
                
        }
}