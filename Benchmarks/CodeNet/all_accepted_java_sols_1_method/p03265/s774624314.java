import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		
		int subx = x1 - x2;
		int suby = y1 - y2;
		
		if(subx<=0) {
			if(suby<=0) {
				System.out.println((x2+suby) + " " + (y2-subx) +" "+ (x1+suby) + " " + (y1-subx));		
			}else {
				System.out.println((x2+suby) + " " + (y2-subx) +" "+ (x1+suby) + " " + (y1-subx));
			}
		}else {
			if(suby<=0) {
				System.out.println((x2+suby) + " " + (y2-subx) +" "+ (x1+suby) + " " + (y1-subx));		
			}else {
				System.out.println((x2+suby) + " " + (y2-subx) +" "+ (x1+suby) + " " + (y1-subx));
			}
		}
	
		in.close();
	}
}
