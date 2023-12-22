import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
      	int hito = sc.nextInt();
      	int menu = sc.nextInt();
      	int mesi[] = new int[menu+1];
      
      for(int i = 0; i < hito; i++){
        int a = sc.nextInt();
      	for(int j = 0; j < a;j++){
        	mesi[sc.nextInt()] += 1;
        }
      }
		int cnt = 0;
		for(int i = 1; i <= menu ; i++){
          if(mesi[i]==hito){cnt++;}
        }
      	System.out.print(cnt);


    }
}