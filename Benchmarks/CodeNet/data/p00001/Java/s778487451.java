class Main{
    public static void main(String[] args) throws Exception{
       if(args.length == 0)
			System.out.print("Input is empty");
		else {
		for(int i=0;i<10;i++) {
			for(int j=0;j<=i;j++) {
				int height1 = Integer.parseInt(args[i]);
				int height2 = Integer.parseInt(args[j]);
				if(height1>height2) {
					String temp = args[i];
					args[i] = args[j];
					args[j] = temp;
				}
			}
			
		}
		for(int i=0;i<3;i++)
			System.out.println(args[i]);
		}
    }
	
    
}