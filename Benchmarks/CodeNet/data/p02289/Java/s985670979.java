

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

  public static void main(String args[]) throws IOException{

	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      //int n = Integer.parseInt( br.readLine() );

      List Doublelink = new List();


      while(true){

    	  String[] string =  br.readLine().split(" ");

    	  if( string[0].equals("insert") ){

    		  Doublelink.insert( Integer.parseInt( string[1] ) );

    	  }
    	  else if( string[0].equals("delete") ){

    		  Doublelink.delete( Integer.parseInt( string[1] ) );

    	  }
    	  else if( string[0].equals("deleteFirst") ){

    		  Doublelink.deleteFirst();


    	  }
    	  else if( string[0].equals("deleteLast") ){

    		  Doublelink.deleteLast();


    	  }
    	  else if( string[0].equals("extract") ){
    		  System.out.println( Doublelink.List_top_serch());
    		  Doublelink.delete( Doublelink.List_top_serch() );
    		  //Doublelink.printlist();

    	  }
    	  else if( string[0].equals("end") ){

    		  break;
    	  }

      }

      //Doublelink.printlist();

 }
}


class Cell{

	Cell prev;
	Cell next;
	long data;

	Cell(long d) {
	   data = d;
	}

	void setNext(Cell next) {
        this.next = next;
    }

}

class List{

    Cell dummy;

    Cell tail;

	List() {
        // ??????????????????????????????next??¨prev????????????????????????????¨??????????
        dummy = new Cell(0);
        dummy.next = dummy;
        dummy.prev = dummy;
        tail = dummy;
    }


	void insert(long data) {//?????????????´?????????\
        // ???????????????

        Cell c = new Cell(data);
        c.next = dummy.next;
        c.prev = dummy;
        dummy.next.prev = c;
        dummy.next = c;
        tail = dummy.prev;

    }

	void deleteFirst() {//?????????????´??????????
        Cell c = dummy.next;
        c.next.prev=(c.prev);
        c.prev.next = c.next;
        tail = dummy.prev;
    }

	void deleteLast() {//????°????????´??????????


        tail.next.prev =  tail.prev ;
        tail.prev.next =  tail.next;
        tail = dummy.prev;
    }

	void delete(long data ) {//???????????????????´??????????




        for(Cell deletecell = dummy.next;  deletecell != dummy  ;  deletecell = deletecell.next){

        	if( deletecell.data == data ){

        		deletecell.prev.next =  deletecell.next;
        		deletecell.next.prev = deletecell.prev;

                break;
        	}


        }

        tail = dummy.prev;
	}


	long List_top_serch(){

		long sum = dummy.next.data;
		for(Cell end = dummy.next; end!=dummy; end = end.next ){

			if( sum < end.data ){
				sum = end.data;
			}
		}

		return sum;
	}


	void printlist() {//??????????????¨???



		for(Cell end = dummy.next; end!=dummy; end = end.next ){

			System.out.print( end.data );

        	if(end.next != dummy){
            	System.out.print( " " );
            }
		}




        System.out.println();

	}

}