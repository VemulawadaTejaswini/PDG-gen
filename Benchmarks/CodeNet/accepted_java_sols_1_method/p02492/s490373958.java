import java.util.Scanner;

public class Main{

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] ans =  new int[100];
	//int ans=0;
    int a,b;
    char op;
	int f=0;
	int i;
	for(i=0;i<100;i++){
         a=sc.nextInt();
        op=sc.next().charAt(0);
         b=sc.nextInt();        

        switch (op) {
            case '+': ans[i] = a+b;
                      break;
            case '-': ans[i] = a-b;
                      break;
            case '*': ans[i] = a*b;
                      break;
            case '/': ans[i] = a/b;
                      break;
			default: f=1;
					  break;
        }
		if(f==1){break;}
	}
	for(int j=0;j<i;j++){
            System.out.println(ans[j]);
		}             
    }       

  }