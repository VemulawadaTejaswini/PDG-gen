
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main{

	 static int array[][];
	 static int gi=0,gj=0;
     static	int h,w;
	static int wall_yoko[][];
	static int wall_tate[][];

	 public static void main(String[] args)throws Exception{

	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	 while(true){

    String readLine = br.readLine();
    readLine = readLine.trim();
    String[] num = readLine.split("[\\s]+");

    w = Integer.parseInt(num[0]);
    h = Integer.parseInt(num[1]);

    if(w==0 && h==0)
    	return;


    wall_yoko = new int[h][w-1];
    wall_tate = new int[h-1][w];

    array = new int[h][w];

    for(int i=0;i<h;i++){
    	for(int j=0;j<w;j++){
    			array[i][j]=Integer.MAX_VALUE;
    	}}

    for(int i=0;i<h;i++){

    	//?¨?????£????????????????
    	readLine= br.readLine();
    	readLine = readLine.trim();
    	String[] yoko = readLine.split("[\\s]+");
    	for(int j=0;j<w-1;j++)
    		wall_yoko[i][j]=Integer.parseInt(yoko[j]);

    	//???????£????????????????
    	if(i<h-1){
    	readLine= br.readLine();
    	readLine = readLine.trim();
    	String[] tate = readLine.split("[\\s]+");
    	for(int j=0;j<w;j++)
    		wall_tate[i][j]=Integer.parseInt(tate[j]);
    	}
    }

    	//?????????????????¢?´¢????§?
        gi=h;
        gj=w;

    	search(0,0,0);

    	if(array[h-1][w-1] == Integer.MAX_VALUE)
    		System.out.println(0);
    	else
    		System.out.println(array[h-1][w-1]);



    	/* array??????????¢????
        for(int i=0;i<h;i++){
	    	for(int j=0;j<w;j++){
	        	System.out.print(" "+array[i][j] );


	    	}System.out.println("");
        }
*/


	 }//while1??????

}

	 public static void search(int i,int j,int count){

		 count++;

		 //??¢?´¢???????????????????????°????????????
		 if(array[i][j] <= count)
			 return;
		 //????????????????????????????????????????????????????????????????°????????????°??????????????´??°
		 if(array[i][j]>count)
			 array[i][j]=count;

		 PriorityQueue<Integer> queue = new PriorityQueue<Integer>();



		 //????????¢?´¢
		 try{
		 if(j+1<w && wall_yoko[i][j]==0)
			 search(i,j+1,count);
		 }catch(Exception e){}

		 //????????¢?´¢

		 try{
		 if(j-1>=0 && wall_yoko[i][j-1]==0)
			 search(i,j-1,count);
		 }catch(Exception e){}

		 //????????¢?´¢
		 try{
		 if(i+1<h && wall_tate[i][j]==0)
			 search(i+1,j,count);
		 }catch(Exception e){}
		 //????????¢?´¢
		 try{
		 if(i-1>=0 &&wall_tate[i-1][j]==0)
				 search(i-1,j,count);
		 }catch(Exception e){}



	 }

}