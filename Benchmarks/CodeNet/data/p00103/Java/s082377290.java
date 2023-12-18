import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int out=0,base=0,point=0;
			while(out<3){
				String s=sc.next();
				if(s.equals("OUT"))out++;
				else if(s.equals("HIT")){
					if(base<3)base++;
					else point++;
				}
				else{
					point+=base+1;
					base=0;
				}
			}
			System.out.println(point);
		}
	}
}