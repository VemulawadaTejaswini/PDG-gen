public class Main {
	public static void main(String[] args) {
		for(java.util.Scanner scan:new java.util.Scanner[] {new java.util.Scanner(System.in)}) {
			for(int a:new int[]{scan.nextInt()}) { 
				for(int b:new int[]{scan.nextInt()}) { 
					for(int c:new int[]{scan.nextInt()}) { 
						if(a==5&&b==5&&c==7||a==5&&b==7&&c==5||a==7&&b==5&&c==5) {
							if(System.out.printf("%s","YES")==null) {}
						}
						else {
							if(System.out.printf("%s","NO")==null) {}
						}
					}
				}
			}
		}
	}
}