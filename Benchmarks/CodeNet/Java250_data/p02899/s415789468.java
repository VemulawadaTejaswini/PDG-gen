import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int Student;
      	int[] OnSchool=new int[N];
      for (int i = 0 ; i < N; i ++){
          Student = sc.nextInt();
          OnSchool[Student-1]=i+1;
        }     
        System.out.println(Arrays.toString(OnSchool).replace("[","").replace("]","").replace(",",""));
      }
	}
