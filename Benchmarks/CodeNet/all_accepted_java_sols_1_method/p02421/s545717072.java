import java.util.Scanner;

class Main {
    public static void main(String [] args){
         
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();//????????° & ???????????°
        
        int tarou = 0;
        int hanako = 0;
        
        //String[] ba = new String[2];
       
        for( int i = 0 ; i < n ; i++ ){
        	
        	/*String tehuda = sc.nextLine();//?????????????????????????????±????????????????????????cat dog
        	
        	String[] ba = tehuda.split(" ");//????????§??????????????????????????????????´?
        	
        	if( ba[0].compareToIgnoreCase(ba[1]) > 0 ) {
        		tarou = tarou + 3;
        	}else if( ba[0].compareToIgnoreCase(ba[1]) < 0 ){
        		hanako = hanako + 3;
        	}else if( ba[0].compareToIgnoreCase(ba[1]) == 0 ){
        		tarou++;
        		hanako++;
        	}*/
        	
        	String[] ba = new String[2];
        	
        	for(int j = 0 ; j < 2 ; j++){
        		ba[j] = sc.next();
        	}
        	
        	if( ba[0].compareToIgnoreCase(ba[1]) > 0 ) {
        		tarou = tarou + 3;
        	}else if( ba[0].compareToIgnoreCase(ba[1]) < 0 ){
        		hanako = hanako + 3;
        	}else if( ba[0].compareToIgnoreCase(ba[1]) == 0 ){
        		tarou++;
        		hanako++;
        	}
        	
        }
        
        System.out.println(tarou + " " + hanako);
        
    }
}