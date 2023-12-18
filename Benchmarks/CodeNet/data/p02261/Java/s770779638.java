import java.util.Scanner;

class CARD{
	char mark;
	int num;
	public CARD(String str) {
		char c0,c1;
		int n;
		c0=str.charAt(0);
		c1=str.charAt(1);
		mark=c0;
		n=Character.getNumericValue(c1);
		num=n;
	}
	public void SHOW() {
		System.out.print(mark+""+num);
	}
}

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int i,j,n,min,flag=0;
		String str="";
		n=scan.nextInt();
		CARD[] carda=new CARD[n];
		CARD[] cardb=new CARD[n];
		for(i=0;i<n;i++) {
			str=scan.next();
			carda[i]=new CARD(str);
			cardb[i]=carda[i];
		}
		CARD swap=new CARD(str);
		for(i=n;i>0;i--){
            for(j=0;j<i-1;j++){
                if(carda[j].num>carda[j+1].num){
                    swap=carda[j];
                    carda[j]=carda[j+1];
                    carda[j+1]=swap;
                }
            }
        }
		for(i=0;i<n;i++) {
			carda[i].SHOW();
			if(i<n-1) {
				System.out.print(" ");
			}
		}
		System.out.println();
		System.out.println("Stable");
		for(i=0;i<n;i++) {
            min=i;
            for(j=i;j<n;j++) {
                if(cardb[min].num>cardb[j].num) {
                    min=j;
                }
            }
            if(min!=i) {
                swap=cardb[min];
                cardb[min]=cardb[i];
                cardb[i]=swap;
            }
        }
		for(i=0;i<n;i++) {
			cardb[i].SHOW();
			if(carda[i].mark!=cardb[i].mark) {
				flag=1;
			}
			if(i<n-1) {
				System.out.print(" ");
			}
		}
		System.out.println();
		if(flag==0) {
			System.out.println("Stable");
		}
		else {
			System.out.println("Not stable");
		}
		scan.close();
	}
}
