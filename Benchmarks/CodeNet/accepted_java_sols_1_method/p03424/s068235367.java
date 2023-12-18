import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
                String S[] = new String [N];
                String Str = "Two";
                 for(int i=0;i<N;i++){
                  S[i] = sc.next();
                 }
                 for(int i=0;i<N;i++){
                    if(S[i].equals("Y")){
                      Str = "Four";
                      break;
                    }
                    else
                      Str = "Three";
                  }
                System.out.println(Str);
	}
}