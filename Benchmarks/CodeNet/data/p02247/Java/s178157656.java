import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String args[] ) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Origin = br.readLine();
        String Serch = br.readLine();

        String[] origin = Origin.split("");
        String[] serch = Serch.split("");
        int plusi = PlusI(serch);

        int Origin_length = origin.length;
       // System.out.println( SameString(serch) );
        for(int i = 0 ; i < Origin_length; ){


           int equal_point = Origin.indexOf(Serch , i);

           if(equal_point>-1){
        	   System.out.println(equal_point);
        	   i = equal_point+serch.length - 1;
           }
           else{
        	    break;
           }

        }


    }


    public static int PlusI(  String[] Serch ){


    	for(int j = 0; j < Serch.length; j++ ){

    	    if( Serch[j].equals(Serch[0]) && 0 < j){
    	    	return j;
    	    }

    	}


        return Serch.length;


    }


    public static boolean SearchWord(String[] Origin , String[] Serch , int i){


    	boolean SerchCheck = false;
    	for(int j = i , k = 0; k < Serch.length; j++ , k++){

    	    if( Serch[k].equals(Origin[j]) ){
    	    	SerchCheck = true;
    	    }
    	    else{
    	    	return false;
    	    }



    	}


    	return SerchCheck;

    }


    public static boolean SameString(String[] Serch ){


    	boolean SerchCheck = false;
    	for(int i = 0 ; i < Serch.length; i++){

    	    if( Serch[0].equals(Serch[i]) ){
    	    	SerchCheck = true;
    	    }
    	    else{
    	    	return false;
    	    }



    	}


    	return SerchCheck;

    }



}