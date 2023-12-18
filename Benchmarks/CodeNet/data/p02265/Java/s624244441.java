import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public Main() {
    }

    public static void main(String[] args ) {
    		Main main = new Main();
    		main.exec();
    }

    public void exec() {
        BufferedReader bf = null;
        try{
            bf = new BufferedReader(new InputStreamReader(System.in));
            exec_body(bf);
        } catch (IOException e) {
			e.printStackTrace();
		}
        finally{
            if( bf != null ) {
                try {
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
            }
        }
    }

    public static boolean isEmpty( String str ) {
    		return str == null || str.length() == 0;
    }

    public void exec_body( BufferedReader bf ) throws IOException {
    		String line = bf.readLine();
    		int lineCnt = Integer.parseInt(line);
    		IchiLinkedList<Integer> list = new IchiLinkedList<>();
    		while( lineCnt > 0 ) {
    			lineCnt--;
    			line=bf.readLine();
        		String[] lines = line.split(" ");
        		String command = lines[0];
        		Integer val = ( lines.length >= 2 ) ? Integer.decode(lines[1]) : null;
        		if( "insert".equals(command) ) {
        			list.insert(val);
        		} else if ( "delete".equals(command) ) {
        			list.delete(val);
        		} else if ( "deleteFirst".equals(command) ) {
        			list.deleteFirst();
        		} else if ( "deleteLast".equals(command)) {
        			list.deleteLast();
        		}
        }

        boolean isFirst  = true;
        StringBuilder bd = new  StringBuilder();
        IchiLinkedListElement<Integer> element = list.getFirst();
        while( element != null ) {
        		if ( !isFirst ) {
        			bd.append(" ");
        		}
        		bd.append(element._val);
        		isFirst = false;
        		element = element.getNext();
        }

        System.out.println(bd.toString());
    }

    public class IchiLinkedList<T> {
    		private IchiLinkedListElement<T> _first = null;
    		private IchiLinkedListElement<T> _last = null;

    		public IchiLinkedListElement<T> getFirst() {
    			return _first;
    		}

    		public IchiLinkedListElement<T> getLast() {
    			return _last;
    		}

    		public void insert( T element ) {
    			if ( element == null ) {
    				return;
    			}

    			IchiLinkedListElement<T> insertElement = new IchiLinkedListElement<T>(element);
    			if( _first == null ) {
    				_first = insertElement;
    				_last = _first;
    			} else {
        			insertElement._next = _first;
        			_first._prev = insertElement;
        			_first = insertElement;
    			}
    		}

    		public void delete( T element ) {
    			IchiLinkedListElement<T> curElement = _first;
    			IchiLinkedListElement<T> sameElement = null;
    			while( curElement != null ) {
    				if( curElement._val.equals(element) ) {
    					sameElement = curElement;
    					break;
    				}
    				curElement = curElement._next;
    			}
    			if( sameElement == null ) {
    				return;
    			}

    			IchiLinkedListElement<T> prev = sameElement._prev;
    			IchiLinkedListElement<T> next = sameElement._next;
    			if( _first == sameElement ) {
    				deleteFirst();
    			} else if( _last == sameElement ) {
    				deleteLast();
    			} else {
        			prev.setNext(next);
        			next.setPrev(prev);
    			}
    		}

    		public void deleteFirst() {
    			if( _first == null ) {
    				throw new RuntimeException("Cannot delete because of empty.");
    			}
    			if( _first == _last ) {
    				_first = null;
    				_last = null;
    			} else {
    				_first = _first._next;
    				_first._prev = null;
    			}
    		}

    		public void deleteLast() {
    			if( _first == null ) {
    				throw new RuntimeException("Cannot delete because of empty.");
    			}

    			if( _first == _last ) {
    				_first = null;
    				_last = null;
    			} else {
    				_last = _last._prev;
    				_last._next = null;
    			}
    		}
    }

    public class IchiLinkedListElement<T> {
    		private T _val = null;
    		private IchiLinkedListElement<T> _prev = null;
    		private IchiLinkedListElement<T> _next = null;

    		public IchiLinkedListElement(T val ) {
    			_val = val;
    		}

    		public void setPrev( IchiLinkedListElement<T> prev ) {
    			_prev = prev;
    		}

    		public void setNext( IchiLinkedListElement<T> next ) {
    			_next = next;
    		}

    		public T getVal() {
    			return _val;
    		}

    		public IchiLinkedListElement<T> getPrev() {
    			return _prev;
    		}

    		public IchiLinkedListElement<T> getNext() {
    			return _next;
    		}
    }
}
