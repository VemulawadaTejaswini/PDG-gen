import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int h=Integer.parseInt(scan.next());
		int w=Integer.parseInt(scan.next());
		String[] s=new String [h];
		for (int y=0;y<h;++y){
			s[y]=scan.next();
		}
		boolean ans =true;
		boolean check;
		for (int y=0;y<h;++y){
			for (int x=0;x<w;++x){
				if(s[y].charAt(x)=='#'){
					//check
					check=false;
					for(int i=-1;i<=1;++i){
						if (0<=(y+i) && (y+i)<h && i!=0){
							if (s[y+i].charAt(x)=='#')check=true;

						}
						if (0<=(x+i) && (x+i)<w && i!=0){
							if (s[y].charAt(x+i)=='#')check=true;

						}
					}
					if (!check){
						ans=false;
						break;
					}
				}
			}
		}
		System.out.print(ans?"Yes":"No");





	}
}
//end