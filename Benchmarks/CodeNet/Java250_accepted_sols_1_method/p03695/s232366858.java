import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++){
			a[i] = scn.nextInt();
		}
      	int gra = 0;
      	int bro = 0;
      	int gre = 0;
      	int ligh = 0;
      	int blu = 0;
      	int yel = 0;
      	int ora = 0;
      	int red = 0;
      	int xxx = 0;
      	int count = 0;
      	for(int i=0; i<a.length; i++){
          if(a[i]>0 && a[i]<400){
            gra++;
            if(gra==1) count++;
          }
          if(a[i]>=400 && a[i]<800){
            bro++;
            if(bro==1) count++;
          }
          if(a[i]>=800 && a[i]<1200){
            gre++;
            if(gre==1) count++;
          }
          if(a[i]>=1200 && a[i]<1600){
            ligh++;
            if(ligh==1) count++;
          }
          if(a[i]>=1600 && a[i]<2000){
            blu++;
            if(blu==1) count++;
          }
          if(a[i]>=2000 && a[i]<2400){
            yel++;
            if(yel==1) count++;
          }
          if(a[i]>=2400 && a[i]<2800){
            ora++;
            if(ora==1) count++;
          }
          if(a[i]>=2800 && a[i]<3200){
            red++;
            if(red==1) count++;
          }
          if(a[i]>=3200) xxx++;
        }
      	int max = count+xxx;
      	if(count==0) count++;
      	int min = count;
      	System.out.println(min + " "+ max);
	}
}
