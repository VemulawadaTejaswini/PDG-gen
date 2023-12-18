public class Main{
	public static void main(String[] args){
		int n,x,i,a,b,c,num;
		
		i = 0;
		
		while(Integer.parseInt(args[i]) != 0){
			n = Integer.parseInt(args[i]);
			x = Integer.parseInt(args[i+1]);
			num = 0;
			
			for(a=1; a<=n; a++){
				
				for(b=1; b<=n; b++){
					if(b==a){ continue; }
				
					for(c=1; c<=n; c++){
						if(c==a || c==b){
							continue;
						}else if(a+b+c == x){
							num++;
						}
					}
				}
			}
			System.out.println(num/6);
			i += 2;
		}
	}
}