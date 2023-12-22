import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 高橋_Hits
		int first_hits = sc.nextInt();
		// 高橋_Atk
		int first_atk = sc.nextInt();
		// 青木_Hits
		int second_hits = sc.nextInt();
		// 青木_Atk
		int second_atk = sc.nextInt();

      	while( first_hits>=0 && second_hits>=0 ) {
          second_hits -= first_atk;
          //System.out.println("second " + second_hits);
          if (second_hits <= 0) {
            break;
          }
		  first_hits -= second_atk;
          //System.out.println("first " + first_hits);
          if (first_hits <= 0) {
            break;
          }
        }
      
      	if (second_hits <= 0) {
            System.out.println("Yes");
        } else /* (first_hits <= 0)*/ {
            System.out.println("No");
        }


	}
}