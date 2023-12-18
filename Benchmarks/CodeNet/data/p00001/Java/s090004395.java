class Main{
    public static void main(String[] a){
		try{
			String sub = "";
			int start = 0;
			while(true){

				for (int i = start; i < 9; i++) {
					int num1 = Integer.parseInt(a[i]);
					int num2 = Integer.parseInt(a[i+1]);
					if (num1>num2) {
						sub = a[i+1];
						a[i+1]=a[i];
						a[i] = sub;
					}
				}
				if(start>8)break;
				start++;
			}
		}catch(Exception e){
			
		}
		for (int i = 0; i < 3; i++) {
			String string = a[9-i];
			System.out.println(string);
		}
    }
}