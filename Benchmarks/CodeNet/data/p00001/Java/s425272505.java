public class Main{
	public static void main(String[] args){
		int[] mountains = new int[args.length];
		int[] big = new int[3];
		boolean ishas=false;
		int cursor=0;
		for(int i=0;i<args.length;i++){
			mountains[i]=Integer.valueOf(args[i]);
		}
		big[0]=mountains[0];
		for(;cursor<3;cursor++){
			for(int i=0;i<args.length;i++){
				ishas=false;
				if(cursor<3){		
					if(big[cursor]<mountains[i]){
						for(int j=0;j<cursor;j++){
							if(big[j]==mountains[i]) ishas=true;
						}
						if(!ishas){
							big[cursor]=mountains[i];
						}
					}
				}
			}
		}
		for(int i=0;i<3;i++){
			System.out.println(big[i]);
		}
	}

}