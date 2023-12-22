import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int X = scan.nextInt();
                int N = scan.nextInt();
                
                int min1=-1;
                ArrayList<Integer> list = new ArrayList<>();
                for(int i=-1; i<=101; i++){
                    list.add(i);
                }       
                for(int i=0; i<N;i++){
                    int p = scan.nextInt();
                    for(int j=0; j<list.size(); j++){
                        if(p==list.get(j)){
                            list.remove(j);
                            break;
                        }
                    }
                }
                int sa = 1000;
                int ans = -1;
                for(int i=0; i<list.size();i++){
                     if(sa>Math.abs(X-list.get(i))){
                         sa = Math.abs(X-list.get(i));
                         ans = list.get(i);
                     }
                }
                
                System.out.println(ans);
        }
}