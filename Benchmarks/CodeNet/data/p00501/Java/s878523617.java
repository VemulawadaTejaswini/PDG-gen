import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String old_board = new String();
		String tage_board=sc.next();
		char[] tage=new char[tage_board.length()+1];
		for(int i=0;i<tage_board.length();i++){
			tage[i]=tage_board.charAt(i);
		}
		for(int i=0;i<n;i++){
			boolean ok=false;
			int k=0,first=0,sa = -10,m=0,hit=0;
			old_board=sc.next();
			char[] old=new char[old_board.length()];
			for(int j=0;j<old_board.length();j++){
					old[j]=old_board.charAt(j);
			}
			 while(k<old_board.length() && m<tage_board.length()){	
				 
					if(old[k] == tage[m]){
						sa=first-k;
						if(m==0){
							hit=k;
							m++;
						}
						if(m>0 && sa==first-k){
							sa=first-k;
							//k=k+sa-1;
							ok=true;
							m++;
						}else{
								ok=false;
								k=hit+1;
								m=0;
								
						}
						first=k;
					}
				k++;
			 }
			 if(ok)count++;
			
		}
		System.out.println(count);
		
		
		
	}

}