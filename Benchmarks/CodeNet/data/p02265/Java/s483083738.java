import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList list = new LinkedList();
		int n = Integer.parseInt(br.readLine());

		for(int i = 0; i < n; i++){

			String[] input = br.readLine().split(" ");
			String ope = input[0];
			int x = Integer.parseInt(input[1]);

			if(ope.equals("insert")){
				list.insert(x);
			}else if(ope.equals("delete")){
				list.delete(x);
			}else if(ope.equals("deleteFirst")){
				list.deleteFirst();
			}else if(ope.equals("deleteLast")){
				list.deleteLast();
			}


		}

		list.output();

	}

}

class Cell{

	int data;
	Cell next;
	Cell back;

	public Cell(int x){

		data = x;

	}

}

class LinkedList{

	Cell head;

	public LinkedList(){

		head = new Cell(-1);
		head.next = head;
		head.back = head;

	}

	public void insert(int x){

		Cell first = head.next;
		Cell c = new Cell(x);
		c.next = first;
		c.back = head;
		first.back = c;
		head.next = c;


	}

	public void delete(int x){

		Cell refe = head.next;

		while(refe.data != -1){

			if(refe.data == x){

				refe.next.back = refe.back;
				refe.back.next = refe.next;
				break;

			}else{

				refe = refe.next;

			}

		}

	}

	public void deleteFirst(){

		head.next = head.next.next;
		head.next.back = head;

	}

	public void deleteLast(){

		head.back = head.back.back;
		head.back.next = head;

	}

	public void output(){

		Cell refe = head.next;
		StringBuilder sb = new StringBuilder();

		while(refe.data != -1){

			sb.append(refe.data);
			refe = refe.next;

			if(refe.data != -1){
				sb.append(" ");
			}

		}

		sb.append("\n");

		System.out.print(sb);

	}

}