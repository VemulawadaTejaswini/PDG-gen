import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int[] a = new int[9];
		for(int i=0; i<a.length; ++i){
			a[i] = scn.nextInt();
		}
      	int n = scn.nextInt();
		int[] b = new int[n];
		for(int i=0; i<b.length; ++i){
			b[i] = scn.nextInt();
		}
      	for(int i=0; i<a.length; ++i){
			for(int j=0; j<b.length; ++j){
				if(a[i]==b[j]){
                  a[i]=0;
                }
			}
		}
      	int check = 0;
      	if(a[0]==0 && a[1]==0 && a[2]==0){
          check = 1;
        }
      	if(a[3]==0 && a[4]==0 && a[5]==0){
          check = 1;
        }
      	if(a[6]==0 && a[7]==0 && a[8]==0){
          check = 1;
        }
      	if(a[0]==0 && a[3]==0 && a[6]==0){
          check = 1;
        }
      	if(a[1]==0 && a[4]==0 && a[7]==0){
          check = 1;
        }
      	if(a[2]==0 && a[5]==0 && a[8]==0){
          check = 1;
        }
      	if(a[0]==0 && a[4]==0 && a[8]==0){
          check = 1;
        }
      	if(a[2]==0 && a[4]==0 && a[6]==0){
          check = 1;
        }
      	if(check==0){
          System.out.println("No");
        }else{
          System.out.println("Yes");
        }
	}
}