import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int h=sc.nextInt(),m=sc.nextInt(),h2=sc.nextInt(),m2=sc.nextInt(),k=sc.nextInt();
	  int kh=k/60,km=k%60;
	  if(m2>=km) {
		  kh=h2-kh;
		  km=m2-km;
	  }else {
		  kh=h2-kh-1;
		  km=60-km+m2;
	  }
	  //System.out.println(kh+" "+km);
	  if(km>=m) {
		  kh=kh-h;
		  km=km-m;
	  }else {
		  kh=kh-h-1;
		  km=60-m+km;
	  }
	  System.out.println(kh*60+km);
  }
}

