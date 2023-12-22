import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    String s_original = sc.nextLine();
		    String[] s = s_original.split("",0);
		    int n = s.length;
		    int R_i = 0;
		    int L_i = 0;
		    int[] m = new int[n];
		    int flg =0;
		    int num1=0;
		    int num2=0;
		    for(int i=0;i<n;i++) {
		    	m[i]=0;
		    	if(s[i].equals("R")) {
		    		if(flg == 0) {
		    			flg=1;
		    			num1 += 1;
		    		}else if(flg == 1) {
		    			flg=0;
		    			num2+=1;
		    		}else if(flg==2) {
		    			m[R_i]+=num2;
		    			num2=0;
		    			m[L_i]+=num1;
		    			num1=1;
		    			R_i=0;
		    			L_i=0;
		    			flg=1;
		    		}else if(flg==3) {
		    			m[R_i]+=num2;
		    			num2=0;
		    			m[L_i]+=num1;
		    			num1=1;
		    			R_i=0;
		    			L_i=0;
		    			flg=1;
		    		}
		    	}else if(s[i].equals("L")) {
		    		if(flg==2) {
		    			flg=3;
		    			num2+=1;
		    		}else if(flg==3) {
		    			flg=2;
		    			num1+=1;
		    		}else if(flg==0){
		    			R_i = i-1;
		    			L_i = i;
		    			m[R_i]+=num2;
		    			num2=0;
		    			m[L_i]+=num1;
		    			num1=1;
		    			flg=2;
		    		}else if(flg==1) {
		    			R_i = i-1;
		    			L_i = i;
		    			m[R_i]+=num1;
		    			num1=1;
		    			m[L_i]+=num2;
		    			num2=0;
		    			flg=2;
		    		}
		    	}
		    }
		    m[R_i]+=num2;
			m[L_i]+=num1;
		    for(int i=0;i<n;i++) {
		    	System.out.print(m[i]+" ");
		    }

		    sc.close();
	}
}
