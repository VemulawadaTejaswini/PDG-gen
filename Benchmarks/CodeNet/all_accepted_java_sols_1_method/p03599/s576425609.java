import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double d = sc.nextInt();
		double e = sc.nextInt();
		double f = sc.nextInt();
		a *= 100;
		b *= 100;
		double retleft = 0;
		double retright = 0;
		double retsuiyou = 0;
		for(double inb=0;inb*b<f;inb++){
			for(double ina=0;;ina++){
				double iwater = inb * b + ina * a;
				if(iwater == 0){
					continue;
				}
				if(iwater >= f){
					break;
				}
				double imaxsugar = e*(iwater/100);
				for(double ind=0;ind*d<=imaxsugar;ind++){
					for(double inc=0;;inc++){
						double isugar = ind * d + inc * c;
						if((iwater+isugar)>f){
							break;
						}
						if(isugar>imaxsugar){
							break;
						}
						double isuiyou = 100 * isugar / (iwater + isugar);
						if(isuiyou > retsuiyou){
							retleft = iwater + isugar;
							retright = isugar;
							retsuiyou = isuiyou;
						}
					}
				}
			}
		}
		if(retleft==0){
			retleft = a;
		}
		System.out.println((int)retleft+" "+(int)retright);
    }
}
