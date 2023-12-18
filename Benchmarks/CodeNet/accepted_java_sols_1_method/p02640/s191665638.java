import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
      	int Y = sc.nextInt();
		
      	int ans = 0;
		for(int i = 0;i<=X;i++){
          for(int j = 0;j<=X;j++){
            if(i*2+j*4 == Y && i + j ==X){
              ans = 1;
              break;
            }
          }
        }
      	if (ans == 0)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}