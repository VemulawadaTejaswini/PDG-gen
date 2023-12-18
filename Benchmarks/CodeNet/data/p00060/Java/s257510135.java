import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      int c1 = sc.nextInt();
      int c2 = sc.nextInt();
      int c3 = sc.nextInt();
      int count=0;
      for(int i=1;i<=10;i++){
        if(i != c1 && i != c2 && i != c3 && (i+c1+c2) <= 20) {
	  count++;
	}
      }
      if(count > 3) {
        System.out.println("YES");
      }
      else {
	System.out.println("NO");
      }
    }    
  }
}