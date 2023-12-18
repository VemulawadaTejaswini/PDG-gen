import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=Integer.parseInt(sc.nextLine());
                        if(n==0){
                            break;
                        }
			int pointA=0;
			int pointB=0;
			for(int i=0;i<n;i++){
				String[] str = sc.nextLine().split(" ");
				int numA=Integer.parseInt(str[0]);
				int numB=Integer.parseInt(str[1]);
				if(numA>numB){
					pointA+=numA+numB;
				}else if(numA<numB){
					pointB+=numA+numB;
				}else if(numA==numB){
					pointA+=numA;
					pointB+=numB;
				}
			}
			System.out.println(pointA+" "+pointB);			
		}

	}
}
