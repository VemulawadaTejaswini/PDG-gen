import java.util.Scanner;

public class Main{
 public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int str[] = new int[N];
   boolean flag = true;
   for(int i=0; i<N; i++) {
	   str[i] = sc.nextInt();
      }

   for(int i=0; i<N; i++) {
	if(str[i] % 2 == 0) {
		boolean flag1 = false;
		if(str[i] % 3 == 0) {
			flag1 = true;
		}
			if(str[i] % 5 == 0) {
			flag1 = true;
			}

			if(flag1 == false) {
				flag = false;
				break;
			}

			}
		}

   if(flag == true) {
   System.out.print("APPROVED");
   }else {
   System.out.print("DENIED");

   }




   }

   }

