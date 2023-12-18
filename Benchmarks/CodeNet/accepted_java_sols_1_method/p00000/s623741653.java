class Main{
    public static void main(String[] args){
        int sum=0;
	for(int i=1;i<10;i++){
            for(int e=1;e<10;e++){
		sum=i*e;
                System.out.println(""+i+"x"+e+"="+sum);
            }
        }
    }
}