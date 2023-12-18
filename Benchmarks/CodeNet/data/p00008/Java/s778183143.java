import java.util.*;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int i=0,j=0,h=0,k=0,cnt=0;
			for(i=0;i<10;i++){
				//System.out.println("A"+i+" "+j+" "+k+" "+h);
				if(n==(i+j+k+h)&&j!=0&&k!=10&&h!=10){
					//System.out.println("A"+i+" "+j+" "+k+" "+h);
					cnt++;
				}
				for(j=0;j<10;j++){
					//System.out.println("B"+i+" "+j+" "+k+" "+h);
					if(n==(i+j+k+h)&&k!=10&&h!=10){	
						//System.out.println("A"+i+" "+j+" "+k+" "+h);
						cnt++;
					}
					//System.out.println("A"+i+" "+j+" "+k+" "+h);
					for(k=0;k<10;k++){
						//System.out.println("C"+i+" "+j+" "+k+" "+h);
						if(n==(i+j+k+h)&&h!=10){
							//System.out.println("A"+i+" "+j+" "+k+" "+h);
							cnt++;
						}
						for(h=0;h<10;h++){
							//System.out.println("D"+i+" "+j+" "+k+" "+h);
							if(n==(i+j+k+h)){
								//System.out.println("A"+i+" "+j+" "+k+" "+h);
								cnt++;
							}
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}
}