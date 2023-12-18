

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

  public static void main(String args[]) throws IOException{

	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt( br.readLine() );

      List Doublelink = new List();
      String[] order = new String[n];
      for(int i = 0; i < n; i++ ){
        order[i] =  br.readLine();
      }


      for(int i = 0; i < n; i++ ){

    	  String[] string =  order[i].split(" ");

    	  if( string[0].equals("insert") ){
    		  //System.out.println("check1 " + i);
    		  Doublelink.insert( Integer.parseInt( string[1] ) );
    		  //Doublelink.printlist();
    	  }
    	  else if( string[0].equals("delete") ){
    		  //System.out.println("check2 "+ i);
    		  Doublelink.delete( Integer.parseInt( string[1] ) );
    		 //Doublelink.printlist();
    	  }
    	  else if( string[0].equals("deleteFirst") ){
    		 //System.out.println("check3 " + i);
    		  Doublelink.deleteFirst();
    		  //Doublelink.printlist();

    	  }
    	  else if( string[0].equals("deleteLast") ){
    		 //System.out.println("check4 " + i);
    		  Doublelink.deleteLast();
    		 //Doublelink.printlist();

    	  }

    	 // System.out.println(n);
      }

      Doublelink.printlist();

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
    // next?????????
    Cell getNext() {
        return next;
    }
    // prev??????????????????
    void setPrev(Cell prev) {
        this.prev = prev;
    }
    // prev?????????
   Cell getPrev() {
        return prev;
    }
    // ??????????????????
    long getData() {
        return data;
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
        Cell c = dummy.getNext();
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
        		//deletecell.getPrev().setNext( deletecell.getNext() );
                //deletecell.getNext().setPrev( deletecell.getPrev() );

                break;
        	}


        }

        tail = dummy.prev;
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