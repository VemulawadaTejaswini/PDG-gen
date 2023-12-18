import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String[] list = s.split("");
      	int[] a = new int[s.length()];
		for(int i=0; i<a.length; ++i){
			a[i] = Integer.parseInt(list[i]);
		}
      	if(a[0]+a[1]+a[2]+a[3]==7){
          System.out.println(a[0]+"+"+a[1]+"+"+a[2]+"+"+a[3]+"=7");
        }else if(a[0]+a[1]+a[2]-a[3]==7){
          System.out.println(a[0]+"+"+a[1]+"+"+a[2]+"-"+a[3]+"=7");
        }else if(a[0]+a[1]-a[2]+a[3]==7){
          System.out.println(a[0]+"+"+a[1]+"-"+a[2]+"+"+a[3]+"=7");
        }else if(a[0]-a[1]+a[2]+a[3]==7){
          System.out.println(a[0]+"-"+a[1]+"+"+a[2]+"+"+a[3]+"=7");
        }else if(a[0]-a[1]-a[2]+a[3]==7){
          System.out.println(a[0]+"-"+a[1]+"-"+a[2]+"+"+a[3]+"=7");
        }else if(a[0]-a[1]+a[2]-a[3]==7){
          System.out.println(a[0]+"-"+a[1]+"+"+a[2]+"-"+a[3]+"=7");
        }else if(a[0]+a[1]-a[2]-a[3]==7){
          System.out.println(a[0]+"+"+a[1]+"-"+a[2]+"-"+a[3]+"=7");
        }else{
          System.out.println(a[0]+"-"+a[1]+"-"+a[2]+"-"+a[3]+"=7");
        }
	}
}