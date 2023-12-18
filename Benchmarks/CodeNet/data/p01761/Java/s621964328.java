import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Book[] books = new Book[n];
		for (int i = 0; i < n; i++) {
		    books[i] = new Book(sc.next(), sc.next(), sc.next());
		}
		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    if (i != 0) {
		        sb.append("\n");
		    }
		    String tQuery = sc.next();
		    String aQuery = sc.next();
		    String from = sc.next();
		    String to = sc.next();
		    for (int j = 0; j < n; j++) {
		        if (books[j].isHit(tQuery, aQuery, from, to)) {
		            sb.append(books[j].title).append("\n");
		        }
		    }
		}
		System.out.print(sb);
	}
	
	static class Book {
	    String title;
	    String author;
	    String date;
	    
	    public Book (String title, String author, String date) {
	        this.title = title;
	        this.author = author;
	        this.date = date;
	    }
	    
	    public boolean isHit(String tQuery, String aQuery, String from, String to) {
	        if (!tQuery.equals("*")) {
	            if (!title.contains(tQuery)) {
	                return false;
	            }
	        }
	        if (!aQuery.equals("*")) {
	            if (!author.contains(aQuery)) {
	                return false;
	            }
	        }
	        if (!from.equals("*")) {
	            if (date.compareTo(from) < 0) {
	                return false;
	            }
	        }
	        if (!to.equals("*")) {
	            if (date.compareTo(to) > 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
}

