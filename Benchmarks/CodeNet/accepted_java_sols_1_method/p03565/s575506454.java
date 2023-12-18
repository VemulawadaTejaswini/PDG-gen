
import java.util.Arrays;
import java.util.Scanner;
class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		String[] h=new String[51];
		for(int i=0;i<51;i++){
			h[i]="zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
		}
		int st=0;
		int ite=0;
		for(int end=st+t.length()-1;end<s.length();end++){
			st=end-t.length()+1;
			//System.out.println(st+" "+end);
			for(int i=0;i<t.length();i++){
				if(s.substring(st+i,st+i+1).equals("?")){
				}else if(!t.substring(i,i+1).equals(s.substring(st+i,st+i+1))){
					break;
				}

				if(i==t.length()-1){
					//String buf="";
					h[ite]="";
					for(int j=0;j<s.length();j++){
						if(st<=j&&j<=end){
							h[ite]+=t.substring(j-st,j-st+1);
						}else{
							String buff=s.substring(j,j+1);
							if(buff.equals("?")){
								h[ite]+="a";
							}else{
								h[ite]+=buff;
							}
						}

					}
					ite++;
				}
			}
		}

		Arrays.sort(h);
		if(h[0].equals("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz")){
			System.out.println("UNRESTORABLE");
		}else{
			System.out.println(h[0]);

		}

	}

}