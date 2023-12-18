
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {


   public static void main(String args[]) throws IOException{

	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int n = Integer.parseInt( br.readLine() );
	   dictionary[] Dictionary = new dictionary[4];
	   //String[] str = new String[n];
	  // System.out.println();
	   StringBuffer ans = new StringBuffer();

	   Dictionary[0] = new dictionary();
	   Dictionary[1] = new dictionary();
	   Dictionary[2] = new dictionary();
	   Dictionary[3] = new dictionary();

       for(int i = 0 , numberA = 0 , numberC = 0 , numberG = 0 , numberT = 0; i < n; i++ ){

    	   String[] order = br.readLine().split(" ");
    	   if( order[0].equals( "insert") ){

    		   if( order[1].charAt(0) == 'A' ){
    		      Dictionary[0].insert( order[1] , numberA);
    		      numberA++;
    		   }
    		   else if( order[1].charAt(0) == 'C'){
    			   Dictionary[1].insert( order[1] , numberC);
    			   numberC++;
    		   }
    		   else if( order[1].charAt(0) == 'G'){
    			   Dictionary[2].insert( order[1] , numberG);
    			   numberG++;
    		   }
    		   else if( order[1].charAt(0) == 'T'){
    			   Dictionary[3].insert( order[1] , numberT);
    			   numberT++;
    		   }

           }
           else if( order[0].equals( "find") ){
        	  // Dictionary.orderdictionary();
        	   //Dictionary.printlist();
        	   //System.out.println( Dictionary.findwordBinary(order[1]));
        	   //ans.append(Dictionary.findword(order[1]) + "\n");



        	   if( order[1].charAt(0) == 'A' ){
        		   ans.append(Dictionary[0].findword(order[1]) + "\n");
        		//   System.out.println( Dictionary[0].findword(order[1]) );

     		   }
     		   else if( order[1].charAt(0) == 'C'){
     			  ans.append(Dictionary[1].findword(order[1]) + "\n");
     			// System.out.println( Dictionary[1].findword(order[1]) );
     		   }
     		   else if( order[1].charAt(0) == 'G'){
     			   Dictionary[2].insert( order[1] , numberG);
     			  ans.append(Dictionary[2].findword(order[1]) + "\n");
     			// System.out.println( Dictionary[2].findword(order[1]) );
     		   }
     		   else if( order[1].charAt(0) == 'T'){
     			   Dictionary[3].insert( order[1] , numberT);
     			  ans.append(Dictionary[3].findword(order[1]) + "\n");
     			// System.out.println( Dictionary[3].findword(order[1]) );
     		   }


           }
       }


       //Dictionary.printlist();
      // Dictionary.orderdictionary();
       //Dictionary.printlist();
       System.out.print(ans.toString());
   }


}


class word {

	String string;
    word next;
    word prev;
    int wordN;

    word(String s , int n) {
        string = s;
        wordN = n;
    }

    void printbuff(){

    	System.out.println(" ?????????:"+string);
    }

}




class dictionary{

	word dummy;

    word tail;

    int tailN;
    int headN;

    dictionary() {
        // ??????????????????????????????next??¨prev????????????????????????????¨??????????
        dummy = new word("xxx", -1);
        dummy.next = dummy;
        dummy.prev = dummy;
        tail = dummy;
        headN = -1;
        tailN = -1;




    }


	void insert(String s , int n) {//?????????????´?????????\
        // ???????????????

        word c = new word(s , n);

        /*
        c.next = dummy.next;
        c.prev = dummy;
        dummy.next.prev = c;
        dummy.next = c;
        tail = dummy.prev;
        */

       if( dummy.next != dummy ){

        c.next = dummy;
        c.prev = dummy.prev;
        dummy.prev.next = c;
        dummy.prev = c;
        tail = dummy.prev;

       }else{
    	   c.next = dummy.next;
           c.prev = dummy;
           dummy.next.prev = c;
           dummy.next = c;
           tail = dummy.prev;
       }

        headN = dummy.next.wordN;
        tailN = dummy.prev.wordN+1;



    }


	void orderdictionary(){

		for(word end = dummy.next; end!=dummy; end = end.next ){

			for(word find = dummy.next; find!=dummy; find = find.next ){

				if( end.string.compareTo( find.string ) < 0  ){
                    String tmpstring = end.string;
					 end.string = find.string;
                     find.string = tmpstring;



	        	 }

			}


        }



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

    		 if( end.string.compareTo( end.next.string ) == 0  ){
        		 //System.out.println( end.string +" "+ end.next.string  );
        	 }

            if(end.string.equals(str)  ){
              return "yes";
            }



 		}

           return "no";
     }


     String findwordBinary(String str ){

    	 int left = headN;
    	 int right = tailN;


    	 while(left < right){
  		   int mid = (right + left)/2;
           int i = 0;
           word end;

  		   for(end = dummy.next; i < mid ;i++,end = end.next){}
  		   //System.out.println(end.string+" left:"+ left +" "+mid +" right"+right+" "+str);
  		   if( end.string.equals(str) ){
             return "yes";
           }
             else if(end.string.compareTo(str ) > 0  ){
       	       right = mid;
           }
             else{
       	       left = mid + 1;
           }


  	   }

        return "no";

     }

	void printlist() {//??????????????¨???

		for(word end = dummy.next; end!=dummy; end = end.next ){


			System.out.println( "??????:" + end.string +" ??????:"+end.wordN+" ???????????????:"+ headN+" ????°??????????"+tailN);


		}


        System.out.println();

	}


}