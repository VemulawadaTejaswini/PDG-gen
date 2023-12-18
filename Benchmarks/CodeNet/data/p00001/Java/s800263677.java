class Main{
    public static void main(String[] args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	int in;
	int[] max = new int[3];

	for(int i=0;i<3;i++){
	    max[i]=0;
	}

	for(int i=0;i<10;i++){
	    in=Integer.parseInt( br.readLine() );
	    if(max[0]<in){
		max[2]=max[1];
		max[1]=max[0];
		max[0]=in;
	    }
	    else if(max[0]==in){
		max[2]=max[1];
		max[1]=in;
	    }
	    else if(max[1]<in){
		max[2]=max[1];
		max[1]=in;
	    }
	    else if(max[1]==in){
		max[2]=max[1];
		max[1]=in;
	    }
	    else if(max[2]<in){
		max[2]=in;
	    }
	}

	System.out.println("======");

	for(int i=0;i<3;i++){
	    System.out.println(max[i]);
	}

    }
}