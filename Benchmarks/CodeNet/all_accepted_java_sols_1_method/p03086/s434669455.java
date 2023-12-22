import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        //int N = sc.nextInt();
        char[] S = sc.next().toCharArray();
        int count=0;
        int max = 0;
        for(int i=0; i<S.length; i++){
            if(S[i]=='A' || S[i]=='G' || S[i]=='C' || S[i]=='T'){
                  count++;
                  max = Math.max(max, count);
            }else{
                    count=0;
            }
        }

        
        
        
        
        
        
        
        
        
        
        
        
          System.out.println(max);
        }
    }