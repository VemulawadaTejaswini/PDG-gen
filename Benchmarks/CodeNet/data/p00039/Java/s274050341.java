import java.util.Scanner;

public class AOJ0039 {
	int n;
	public static void main(String[] args) {
		//new AOJ0039().run();
		new Main().run();
	}
	
	void run(){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()){
		String str=sc.next();
		n=str.length();
		System.out.println(roman(str.toCharArray(),0,0,0));
		}
	}
	//IVXLCDM
	int roman(char ch[],int i,int k,int sum){
		
		//System.out.println(i+" "+sum);
		
		if(i==n){
			return sum;
		}
		
		if(ch[i]=='I'){
			return roman(ch,i+1,1,sum+1);
		}else if(ch[i]=='V'){
			if(k<5){
				return roman(ch,i+1,5,sum+(5-k)-k);
			}
			return roman(ch,i+1,5,sum+5);
		}else if(ch[i]=='X'){
			if(k<10){
				return roman(ch,i+1,10,sum+(10-k)-k);
			}
			return roman(ch,i+1,10,sum+10);
		}else if(ch[i]=='L'){
			if(k<50){
				return roman(ch,i+1,50,sum+(50-k)-k);
			}
			return roman(ch,i+1,50,sum+50);
		}else if(ch[i]=='C'){
			if(k<100){
				return roman(ch,i+1,100,sum+(100-k)-k);
			}
			return roman(ch,i+1,100,sum+100);
		}else if(ch[i]=='D'){
			if(k<500){
				return roman(ch,i+1,500,sum+(500-k)-k);
			}
			return roman(ch,i+1,500,sum+500);
		}else if(ch[i]=='M'){
			if(k<1000){
				return roman(ch,i+1,1000,sum+(1000-k)-k);
			}
			return roman(ch,i+1,1000,sum+1000);
		}

		return -1;
	}
}