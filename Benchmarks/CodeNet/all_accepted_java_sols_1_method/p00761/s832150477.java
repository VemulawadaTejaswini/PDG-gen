import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String a=sc.next();
			int l=sc.nextInt();
			if(Integer.parseInt(a)==0&&l==0) break;
			String[] aa=a.split("");
			int num=1;
			int[] data = new int[21];
			while(true){
				if(num==21) break;
				Integer[] a0=new Integer[l];
				Integer[] a0r=new Integer[l];
				int max=0,min=0,by=1;
				if(num==1){
					for(int i=0;i<l;++i){
						if(a.length()+i<l){ a0[i]=0; a0r[i]=0; }
						else{ a0[i]=Integer.parseInt(aa[i-(l-a.length())]); a0r[i]=a0[i];}
					}
					for(int i=l-1;i>=0;--i){
						data[0]+=a0[i]*by;	by*=10;
					}
					by=1;
				} else {
					String an = an=Integer.toString(data[num-1]);;
					String[] anr=an.split("");
					for(int i=0;i<l;++i){
						if(an.length()+i<l){ a0[i]=0; a0r[i]=0; }
						else{ a0[i]=Integer.parseInt(anr[i-(l-an.length())]); a0r[i]=a0[i]; }
					}
				}
				Arrays.sort(a0);
				Arrays.sort(a0r,Collections.reverseOrder());
				for(int i=l-1;i>=0;--i){
					min+=a0[i]*by; max+=a0r[i]*by;
					by*=10;
				}
				data[num]=max-min;
				num++;
			}
			int ansi=21,ansj=21;
			for(int j=0;j<20;++j){
				for(int i=j+1;i<21;++i){
					if(data[j]==data[i]){
						if(i<ansi){ ansi=i; ansj=j;}
					}
				}
			}
			System.out.println(ansj+" "+data[ansi]+" "+(ansi-ansj));
		}
	}
}

