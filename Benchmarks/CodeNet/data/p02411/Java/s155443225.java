import java.util.Scanner;
	class Main{

		public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int m;
	int f;
	int r;
	int q=0;
	String l = null;
	int s=0;
	for(;q!=9;){
		m=sc.nextInt();
		f=sc.nextInt();
		r=sc.nextInt();
		s = m+r;//??????+??????????¨?
		if(m==-1){
			if(f==-1){
				if(r==-1){
					System.exit(0);
				}
			}			
		}
		if(m==-1){
			l="F";
		}
		if(f==-1){
			l="F";
		}
		if(s>=80){
			l="A";
		}else if(s>=65){
			l="B";
		}else if(s>=50){
			l="C";
		}else if(s>=30){
			l="D";
			if(r>=50){
				l="C";
			}
		}else if(s<30){
			l="F";
		}
		System.out.println(l);		
	}
	

	
	}
	}