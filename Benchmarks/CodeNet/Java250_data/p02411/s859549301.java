import java.io.*;

class Main {
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int m, f, r;

			while(true){
				String buf = br.readLine();
				String[] line = buf.split(" ");
				m = Integer.parseInt(line[0]);
				f = Integer.parseInt(line[1]);
				r = Integer.parseInt(line[2]);
				
					if(m == -1 && f == -1 && r == -1) break;			
					if(m == -1 || f == -1){
						System.out.println("F");
					} else if(m+f >= 80 ){
						System.out.println("A");
					} else if ((m+f) >= 65 && 80 > (m+f)){
						System.out.println("B");
					} else if ((m+f) >=50 && 65 > m+f){
						System.out.println("C");
					} else if ( m+f >=30 && 50 > m+f ){
						if(r < 50){
							System.out.println("D");
						}else if ( r >=50){
							System.out.println("C");
						}
					} else if ( m+f < 30){
						System.out.println("F");
					}
			
			}
		}catch(Exception e){
		}
	}
}