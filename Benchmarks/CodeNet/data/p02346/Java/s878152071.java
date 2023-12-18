import java.util.*;
import java.util.function.*;

/** 0-indexed */
class BinaryIndexedTree<T>{
	/**
	 * a+0=a
	 * a+(b+c)=(a+b)+c
	 */
	public static class Monoid<T,R> implements BiFunction<T,T,R>{
		T identity;

		BiFunction<T,T,R> f;
		public Monoid(T identity,BiFunction<T,T,R> f){
			this.identity=identity;
			this.f=f;
		}
		@Override
		public R apply(T t,T u){
			return f.apply(t,u);
		}
	}

	private final T[] array;

	private final Monoid<T,T> merger;

	@SuppressWarnings("unchecked")
	public BinaryIndexedTree(int size,Monoid<T,T> merger){
		this.merger=merger;
		this.array=(T[])new Object[size+1];
		Arrays.fill(array,merger.identity);
	}

	void merge(int p,T value){
		++p;
		for(final int n=array.length;p<n;p+=Integer.lowestOneBit(p))
			array[p]=merger.apply(array[p],value);
	}

	T query(int p){
		T s=merger.identity;
		for(++p;p>0;p^=Integer.lowestOneBit(p))
			s=merger.apply(s,array[p]);
		return s;
	}
}

public class Main{
	public static void main(String[] $){
		final Scanner s=new Scanner(System.in);
		final int n=s.nextInt();

		BinaryIndexedTree<Integer>bit=new BinaryIndexedTree<>(
				n,new BinaryIndexedTree.Monoid<>(0,Integer::sum));

		for(int q=s.nextInt();q>0;--q) {
			if(s.nextByte()==0) {
				bit.merge(s.nextInt()-1,s.nextInt());
			}else {
				int i=s.nextInt()-1;
				int j=s.nextInt()-1;
				System.out.println(bit.query(j)-bit.query(i-1));
			}
		}
	}
}

