import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();
        int[] N = { N1, N2, N3 };
        int count_5 = 0;
        int count_7 = 0;
      
        for(int i=0; i<3; i++){
          if(N[i] == 5){
            count_5++;
          }else{
            count_7++;
          }
        }
      
        if(count_5==2 && count_7==1){
          System.out.println("YES");
        }else{
          System.out.println("NO");
        }
          
    }
}