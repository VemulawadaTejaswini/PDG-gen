
public class Main {
	public static void main(String args[]){
		int cx1, cy1, r1;
		int cx2, cy2, r2;
		
		if(args.length != 0){
			cx1 = Integer.valueOf(args[0]);
			cy1 = Integer.valueOf(args[1]);
			r1 = Integer.valueOf(args[2]);
			cx2 = Integer.valueOf(args[3]);
			cy2 = Integer.valueOf(args[4]);
			r2 = Integer.valueOf(args[5]);
			
			int l = (int) Math.sqrt(Math.pow(cx1 - cx2, 2) + Math.pow(cy1 - cy2, 2));
			if(l > (r1+r2)) 
				System.out.println("4");
			else if(l == (r1+r2)) 
				System.out.println("3");
			else if(l < (r1+r2)) {
				int maxr = r1;
				int minr = r2;
				if(r1 < r2){
					maxr = r2;
					minr = r1;
				}
				if(l > (maxr-minr))
					System.out.println("2");
				else if(l == (maxr-minr))
					System.out.println("1");
				else if(l < (maxr-minr))
					System.out.println("0");
			}
		}
		else System.out.println("Input doesn't be exist");
	}	
}

