import java.util.*; 

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
      
      if(x*4 < y && y%2==1){
        System.out.println("No");
        return;
      }
      System.out.println("Yes");
    }
}