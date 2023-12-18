
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {


   public static void main(String args[]) throws IOException{

	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int n = Integer.parseInt( br.readLine() );
	   dictionary Dictionary = new dictionary();
	   String[] str = new String[n];
	  // System.out.println();
       for(int i = 0; i < n; i++ ){
    	  // System.out.println( i);
    	   str[i] =  br.readLine();
    	   //System.out.println( i+"2");
           /*
    	   if( order[0].equals( "insert") ){
        	   Dictionary.insert( order[1] );
           }
           else if( order[0].equals( "find") ){
        	  System.out.println( Dictionary.findword(order[1]));
           }
            */


       }
       for(int i = 0; i < n; i++ ){

    	   String[] order = str[i].split(" ");
    	   if( order[0].equals( "insert") ){
        	   Dictionary.insert( order[1] );
           }
           else if( order[0].equals( "find") ){
        	  System.out.println( Dictionary.findword(order[1]));
           }
       }


   }


}


class word {

	String string;
    word next;
    word prev;

    word(String s) {
        string = s;

    }

    void printbuff(){

    	System.out.println(" ?????????:"+string);
    }

}




class dictionary{

	word dummy;

    word tail;

    dictionary() {
        // ??????????????????????????????next??¨prev????????????????????????????¨??????????
        dummy = new word("xxx");
        dummy.next = dummy;
        dummy.prev = dummy;
        tail = dummy;
    }


	void insert(String s) {//?????????????´?????????\
        // ???????????????

        word c = new word(s);
        c.next = dummy.next;
        c.prev = dummy;
        dummy.next.prev = c;
        dummy.next = c;
        tail = dummy.prev;

    }







	void clearword(word clear ){


		for(word end = dummy.next; end!=dummy; end = end.next ){
              if (end == clear  ){

            	  end.prev.next = clear.next;
            	  end.next.prev = clear.prev;
                  break;
              }

		}




	}


     String findword(String str ){

    	 for(word end = dummy.next; end!=dummy; end = end.next ){

            if(end.string.equals(str)  ){
              return "yes";
            }



 		}

           return "no";
     }




	void printlist() {//??????????????¨???

		for(word end = dummy.next; end!=dummy; end = end.next ){


			System.out.println( "??????:" + end.string );


		}


        System.out.println();

	}


}