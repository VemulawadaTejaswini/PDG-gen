import java.io.*;
import java.util.*;

class Main{
	private static ArrayList<String> tri_check(ArrayList<Integer> a){
		ArrayList<String> b = new ArrayList<String>();
		
		for(int i = 0;i<a.size()/3;i++){
			int x2,y2,z2;

			x2 = a.get(i*3)*a.get(i*3);
			y2 = a.get(i*3+1)*a.get(i*3+1);
			z2 = a.get(i*3+2)*a.get(i*3+2);
			
			if((x2+ y2) == z2 || (x2 + z2) == y2 || (y2 + z2) == x2)b.add("YES");  
			else b.add("NO");
			}
		return b;
	}
	private static void print_tri(ArrayList<String> a){
		for(int i = 0;i<a.size();i++){
			System.out.println(a.get(i));
		}
	}
		public static void main(String args[]) throws IOException{
			ArrayList<Integer> tri = new ArrayList<Integer>();
			Scanner scan = new Scanner(System.in);
			
			int a;
			
			a = Integer.parseInt(scan.next());
			
			for(int i = a;i > 0;i--){
				try{
					for(int j = 0;j<3;j++){
						String str1 = scan.next();
						
						tri.add(Integer.parseInt(str1));
						}
					}
				catch(NumberFormatException e){
					break;
				}
			}
			ArrayList<String> res = new ArrayList<String>();
			res = tri_check(tri);
			print_tri(res);
	}
}